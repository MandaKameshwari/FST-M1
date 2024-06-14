# Import pandas
import pandas
 
# Create a Dictionary that will hold our data
data = {
  "Usernames": ["admin", "Chai", "Abhi"],
  "Passwords": ["password", "Chai1", "Abhi2"]
}
 
# Create a DataFrame using that data
dataframe = pandas.DataFrame(data)
 
# Print the DataFrame
print(dataframe)
 
"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("sample.csv", index=False)