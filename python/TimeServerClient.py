#use python 2.7
#use pysimplesoap
#pip install pysimplesoap
from pysimplesoap.client import SoapClient
client = SoapClient(wsdl="http://localhost:9876/ts?wsdl", trace=False)
response = client.getTimeAsString()
print response['return']
response2 = client.getTimeAsElapsed()
print response2['return']