mvn exec:java -Dexec.mainClass="de.qytera.suite_crm.TestRunner" \
  -Ddriver.name="chrome-remote" \
  -DpageUrl="http://suitecrm:8080" \
  -Ddriver.remoteUrl="http://20.79.81.48:4444/wd/hub"