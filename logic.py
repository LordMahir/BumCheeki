from sos import sendSms

pedo = [180,190,200,200,200,200,200,200]
heart_rate = 87


if pedo[-2]-pedo[-3]:
    if pedo[-1] - pedo[-2]:
        if heart_rate>140 or heart_rate<70:
            #send alert + sos protocol
            sendSms("user name", "IIT Mandi","13:01","+919711124243" )