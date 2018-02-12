Feature: AllRisks Application Test

 Scenario Outline: To validate Base Rate
    Given user opens browser
    Then user enter "<username>" and "<password>" and click on login button
    Then click on Homeowner / Dwelling / Condo Quote button
    Then enter the "<agency_code>" in Agency Page
    Then enter the "<insured_name>" Then "<insured_mailing_address>" And "<phone_number>" in insured information
    Then click on Riskinsured address same 
    Then enter the "<protection_class>" Then "<number_of_stories>" Then "<sq_feet>" Then "<year_built>" Then "<number_loss>" in location page
 
 Examples:
 | username            | password | agency_code| insured_name          | insured_mailing_address  | phone_number| protection_class |
 | allrisksunderwriter | welcome1 | 450076     | TestPOMsampleCucumber | 123 main street MD 21632 | 1234567891  | 1				   |
 | allrisksunderwriter | welcome1 | 450076     | TestPOMsampleCucumber | 123 main street MD 21632 | 1234567891  | 1				   |
