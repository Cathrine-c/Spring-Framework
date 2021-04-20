from selenium import webdriver
import time

from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")

#浏览器最大化
driver.maximize_window()

driver.find_element_by_id("kw").send_keys("端午节")
driver.find_element_by_id("su").click()
time.sleep(8)

#复制
driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'a')
time.sleep(5)
#剪贴
driver.find_element_by_id("kw").send_keys(Keys.CONTROL,'x')
time.sleep(5)
