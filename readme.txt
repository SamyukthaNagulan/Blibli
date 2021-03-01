Features Covered:

1. Handling Permissions for fresh install of the nobroker app.
2. Both logged in / non logged in user handle while reporting wrong info
3. Searching properties in "Buy" category with required filters.
4. Reporting wrong info in the property listed.
5. Verifying the success message after reporting.

Framework used:
1. TestNg with POM structure.

Flow design:

1. Execution opens Noboker app and provides the permission if pop up is present.
2. Execution reads the testDataProperties file for the data set needed for execution.
3. As the "Buy" tab is in data set it selects the buy tab and clicks on the search bar.
4. Execution provides the data for city and the locality in the filters and asserts whether the locality entered is matching the field.
5. It provides the number of bedrooms.
6. Execution clicks on the search button and moves to the property listing page.
7. In the listing page as asked it needs to select the fourth element, execution scrolls till the "Loan banner" and then clicks the element.
(As it is a recycler view only static component to scrollTo was the banner, if APIs are exposed then can configure via APIs as well)
8. After moving to the property detail page, execution fetches the title info and subString the "BHK Type" into a variable in the scope of class by name bhkType.
9. Execution scrolls till the Wrong info element and clicks on the same.
10. If user is non-logged in login pop up is shown otherwise user can proceed. (Both logged in and not logged in scenario is added in execution)
11. Execution selects the wrong info types like location, BHK, etc.
12. Execution continues to the suggest changes page where it scrolls till variable name bhkType declared in step 8. (As the xpath/ id of this is not mentioned so have taken an approach to go by text which is taken from the previous page)
13. Execution inputs a note.
14. The last step of execution is validating the thank you message and closing the driver.