import pandas as pd
from pymongo import MongoClient

# Load the CSV file
csv_file_path = '/mnt/data/Data.csv'
data_df = pd.read_csv(csv_file_path)

# Connect to MongoDB
client = MongoClient('mongodb://localhost:27017/')
db = client['BlackCofferDB']
collection = db['Entity']

# Convert DataFrame to dictionary and insert into MongoDB
data_dict = data_df.to_dict("records")
collection.insert_many(data_dict)

print("Data inserted successfully!")