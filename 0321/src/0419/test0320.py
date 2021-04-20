from selenium import webdriver
import time
import os
#键盘操作自动化

#禅道驱动
from selenium.webdriver.common.keys import Keys

driver = webdriver.Chrome()
driver.get("http://127.0.0.1:83/zentao/user-login.html")
driver.maximize_window()

#输入用户名
driver.find_element_by_name("account").send_keys("admin")
#tab 的定位相当于清除了密码框的默认提示信息，等同clear()
driver.find_element_by_name("account").send_keys(Keys.TAB)
time.sleep(8)

#输入密码
driver.find_element_by_name("password").send_keys("chen62487")
#通过定位密码框，enter（回车）来代替登陆按钮
driver.find_element_by_name("password").send_keys(Keys.ENTER)

#有些邮箱账户名的id会变，所以登录自动化测试操作不了，比如网易邮箱
