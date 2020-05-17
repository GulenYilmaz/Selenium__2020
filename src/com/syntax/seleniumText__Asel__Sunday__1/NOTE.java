package com.syntax.seleniumText__Asel__Sunday__1;
/*
 * Logic to handle different webelements:

text boxes:
identify element using any locator
clear
sendText

radio/checkbox:
identify element using any locator
check if it is enabled/selected
click

radio/checkbox group:
identify group by using common attribute and store inside the list
loop through list and retrieve value/text of each element
using if condition compare if value that we want to select is matching the value from element --> click --> break

drop downs with SELECT Tag
identify element using any locator
create an Object of Select Class
get all Options
loop through all options and get a text 
if text is there and matching text that we need to select
.selectByVisibleText();

JS alerts or web based pop ups
switch to alert
accept/dismiss/sendText/getText

Frames:
switch to frame to interract with elements inside that farme otherwise NoSuchElementException will occur
name or id/webElement/index

Windows:
getWindowHandles
switch focus to another wondow using unique string id

Waits:
Implicit
Explicit:
WebDriver wait
Fluent Wait


WebDriverWait wait= new WebDriverWait(driver, time);
wait.until(ExpectedConditions.elementToBeVisible());

WebDriverWait wait= new WebDriverWait(driver, time);
wait.until(ExpectedConditions.elementToBeClickable());

WebDriverWait wait= new WebDriverWait(driver, time);
wait.until(ExpectedConditions.invisibilityOfTheElements);


 */
public class NOTE {

}
