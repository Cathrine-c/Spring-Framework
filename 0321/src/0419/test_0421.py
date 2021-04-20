from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")

#浏览器最大化
driver.maximize_window()

text=driver.find_element_by_id("s-bottom-layer-right").text
print("text:"+text)


driver.find_element_by_id("kw").send_keys("乃万")
driver.find_element_by_id("su").submit()
# time.sleep(6)

#智能等待
driver.implicitly_wait(10)
driver.find_element_by_link_text("乃万_百度百科").click()
time.sleep(5)
# 答应title
title = driver.title
print("title="+title)

url = driver.current_url
print("url="+url)



#清除百度搜索框的内容
# driver.find_element_by_id("kw").clear()
# driver.find_element_by_id("kw").send_keys("秦牛正威")
# driver.find_element_by_id("su").click()


# text = driver.find_element_by_id("s-bottom-layer-right").text
# print("text:"+text)

