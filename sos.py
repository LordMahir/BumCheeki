import time
from time import sleep

from twilio.rest import Client


# import data from firebase

# sending the sms:

def sendSms(name, location, tm,number):
    
    number = number
    app_key = 'AC819e37073cac644b94b72847ddc73d33'
    app_secret = 'f1bd32482040d4dbef7b55db221b4cce'
    
    message = name + " needs your urgent care! Current location: "+ location + " time: "+ tm
    
    client = Client(app_key, app_secret)
    
    sent = client.messages.create(
         body=message,
         from_ =  '+15673716418',
         to = number
    )
  
    print(sent.sid)

sendSms(
    "Mahir",
    "IIT-Mandi",
    '12:37am',
    "+919711124243"
)