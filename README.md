# selenium-java

Topic 1 Locator Question and Answer

Q1 What is a locator in Selenium, and why is choosing the right locator important?
"A locator is used by Selenium WebDriver to identify elements on a webpage. I prefer stable and unique attributes such as ID or a reliable custom attribute. If those are unavailable, I use CSS Selector or XPath. For dynamic elements, I use techniques such as XPath contains, starts-with, or relationships between elements."

Q2Explain all 8 Selenium locator strategies. Which ones do you prefer?
"My first preference is a stable and unique ID. If ID is unavailable, I consider stable name or custom attributes. I also use CSS selectors because they are concise and fast to write. I use XPath when I need complex relationships, dynamic attributes, text-based identification, or parent-child/sibling navigation."
Q3.The ID is dynamic. How would you locate the element?
"I would avoid depending on the dynamic ID. I would first look for a stable unique attribute such as name, data-testid, aria-label, or another custom attribute. If only part of the ID is stable, I can use XPath contains or starts-with."

Q4Difference between findElement() and findElements()?
"findElement() returns the first matching WebElement and throws NoSuchElementException if no matching element exists. findElements() returns a list of matching elements, and if nothing matches, it returns an empty list."**

Q5.Absolute XPath vs Relative XPath
"I prefer relative XPath because it does not depend heavily on the complete DOM hierarchy. Absolute XPath is generally fragile because even a small structural change can make it invalid."

Why preferred?

Relative XPath is:

More readable
More maintainable
Less dependent on DOM structure
More resistant to UI changes

Q7.How do you locate partially dynamic attributes?

<input id="user_98765_test"> only user-is stable 1.use contains 2.starts-with
//input[contains(@id,'user_')];
//input[starts-with(@id,'user_')]
"When an attribute contains a dynamic portion, I identify the stable portion and use XPath functions such as contains or starts-with."

Q8.Difference between contains(), starts-with() and exact matching
Q9.Difference between text() and . in XPath?
Ans"text() targets the element's direct text node, while . represents the string value of the current node and can be useful when text is contained within descendant elements."
Less dependent on DOM structure
More resistant to UI changes
