mvn exec:java -Dexec.mainClass="de.qytera.webpage.TestRunner" \
  -Ddriver.name="chrome-remote" \
  -DpageUrl="http://suitecrm:8080" \
  -Ddriver.remoteUrl="http://localhost:4444/wd/hub"
