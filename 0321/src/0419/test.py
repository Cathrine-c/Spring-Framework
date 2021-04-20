
from selenium import webdriver
import time

driver = webdriver.Chrome()
driver.get("https://www.baidu.com/")
driver.maximize_window()
time.sleep(8)


#id的定位
# driver.find_element_by_id("kw").send_keys("三十而已")
# driver.find_element_by_id("su").click()

#name的定位
# driver.find_element_by_name("wd").send_keys("yamy")
# driver.find_element_by_id("su").click()

#classname的定位
# driver.find_element_by_class_name("s_ipt nobg_s_fm_hover").send_keys("Jolin")
# driver.find_element_by_class_name("btn self-btn bg s_btn btn_h btnhover").click()

#class的定位
# driver.find_element_by_class_name("s_ip").send_keys("月月")
# driver.find_element_by_class_name("btn self-btn bg s_btn btn_h btnhover").click()


#链接定位
# driver.find_element_by_link_text("二十不惑").click()

#tag name 定位  不能用，不唯一
# driver.find_element_by_tag_name("input").send_keys(u"太白山天池")
# driver.find_element_by_id("su").click()



#xpath定位
# driver.find_elements_by_xpath("//*[@name='wd']")[0].send_keys(u"太白山天池")
# driver.find_elements_by_xpath("//*[@id='su']").click()


#css定位
# driver.find_element_by_css_selector("#kw").send_keys(u"太白山天池")
# driver.find_element_by_css_selector("#su").click()

