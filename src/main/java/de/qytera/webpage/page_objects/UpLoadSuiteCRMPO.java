package de.qytera.webpage.page_objects;

import de.qytera.qtaf.core.guice.annotations.Step;
import de.qytera.webpage.TestContext;

import junit.framework.Assert;
import java.lang.Thread;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.*;




public class UpLoadSuiteCRMPO extends TestContext {

    public static final By submit = By.xpath("//button[@type='submit']");
    public static final By create = By.xpath("//button[contains(text(),'🛠 Create environment')]");
    public static final By destroy = By.xpath("//button[contains(text(),'❌ Destroy environment')]");



    @Step(
            name = "Select Project SuiteCRM in DropDown",
            description = "Select Project SuiteCRM"
    )
    public void selectSuiteCRMInDropdown () {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='projectSelector']")));

        dropdown.selectByValue("2");
        WebElement k = dropdown.getFirstSelectedOption();
        String secondoption = k.getText();
        Assert.assertEquals(secondoption, "SuiteCRM Website");

    }



    @Step(
            name = "Upload Data",
            description = "using path for Data upload"
    )
    public void uploadJMeterProject () {
        driver.findElement(By.xpath("//input[@id='jmeterProjectFile']")).sendKeys((System.getProperty("user.dir") + "\\src\\main\\resources\\uploaddata\\example-project.jmx"));

    }



    @Step(
            name = "drag'nDrop",
            description = "using path for Data upload"
    )
    public void dragnDrop () {


        driver.findElement(By.xpath("//input[@id='resourceFiles']")).sendKeys((System.getProperty("user.dir") + "\\src\\main\\resources\\uploaddata\\4cee28e5new-Kopie.jpg"));

    }



    @Step(
            name = "Select Project QyteraWebsite in DropDown",
            description = "Select Project Qytera Website"
    )
    public void verfiyDataOnAWSCloudforSuiteCRM() {
        try {
            Process process = Runtime.getRuntime().exec("aws s3 ls s3://qload-as-a-service-dev/user-1/project-1/project/");

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder sb = new StringBuilder();

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {

                sb.append(line);

            }
            String k = sb.toString();

            Assert.assertTrue(k.contains("distributed_users.csv"));
            Assert.assertTrue(k.contains("jmeter.jmx"));
            Assert.assertTrue(k.contains("shared_customers.csv"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Step(
            name = "Select Project QyteraWebsite in DropDown",
            description = "Select Project Qytera Website"
    )
    public void deleteDataOnAWSCloudforSuiteCRM() {
        try {
            Process process = Runtime.getRuntime().exec("aws s3 rm s3://qload-as-a-service-dev/user-1/project-1/project/ --recursive");

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder sb = new StringBuilder();

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {

                sb.append(line);

            }
            String k = sb.toString();

            Assert.assertTrue(k.contains("distributed_users.csv"));
            Assert.assertTrue(k.contains("jmeter.jmx"));
            Assert.assertTrue(k.contains("shared_customers.csv"));
            Assert.assertTrue(k.contains("4cee28e5new-Kopie.jpg"));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Step(
            name = "Create Enviroment",
            description = "Click on Create Environment Buttom"
    )
    public void createEnviroment() {


        driver.findElement(create).click();

    }


    @Step(
            name = "Validate Slaves",
            description = "Check on AWS if slaves exists"
    )
    public void printResults ()   {

        try {


            Thread.sleep(20000);
            Process process = Runtime.getRuntime().exec("aws ec2 describe-instances --query \"Reservations[].Instances[].{AZ:Placement.AvailabilityZone, State:State.Name, IP:PublicIpAddress ,Type:InstanceType,Project:Tags[?Key==`jmeter-project`]|[0].Value,TagName:Tags[?Key==`Name`]|[0].Value,Role:Tags[?Key==`jmeter-role`]|[0].Value,Inst_id:InstanceId}\" --output json --color off");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder sb = new StringBuilder();



            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                sb.append(line);
            }

            JSONParser parser = new JSONParser();
            JSONArray instances = (JSONArray) parser.parse(sb.toString());

            String s = instances.toString();

            System.out.println(s);


            Assert.assertTrue(s.contains("\"TagName\":\"influx\""));
            Assert.assertTrue(s.contains("\"TagName\":\"jmeter-slave-1\""));
            Assert.assertTrue(s.contains("\"TagName\":\"jmeter-slave-0\""));
            Assert.assertTrue(s.contains("\"TagName\":\"jmeter-master\""));


        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {


        }


    }




    @Step(
            name = "Destroy Enviroment",
            description = "Click on Create Destroy Environment Buttom"
    )
    public void destroyEnviroment () {


        driver.findElement(destroy).click();

    }






    @Step(
            name = "Select submit buttom",
            description = "click submit buttom"
    )
    public void uploadClick () {

        driver.findElement(submit).click();
    }








}
