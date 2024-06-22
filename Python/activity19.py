# Import pandas
import pandas
from pandas import ExcelWriter
from pandas import ExcelFile
 
# Create a dictionary that will be used to create the DataFrame
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
 
# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)
 
# Print the dataframe
print(dataframe)
 
# Write the dataframe to a Excel file
writer = ExcelWriter("vehicles.xlsx")

dataframe.to_excel(writer, 'Sheet1', index = False)
writer.save()
