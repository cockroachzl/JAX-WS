=begin
require 'soap/wsdlDriver'

wsdl_url = 'http://localhost:9876/ts?wsdl'

service = SOAP::WSDLDriverFactory.new(wsdl_url).create_rpc_driver

service.wiredump_file_base = 'soapmsgs'

result1 = service.getTimeAsString
result2 = service.getTimeAsElapsed

puts "Current time is: #{result1}"
puts "Elapsed milliseconds from the epoch: #{result2}"
=end

require 'savon'

# create a client for the service
client = Savon.client(wsdl: 'http://localhost:9876/ts?wsdl')

#print a list of operations
puts client.operations

get_time_as_string_response = client.call(:get_time_as_string)
puts get_time_as_string_response.body[:get_time_as_string_response][:return]

get_time_as_elapsed_response = client.call(:get_time_as_elapsed)
puts get_time_as_elapsed_response.body[:get_time_as_elapsed_response][:return]

