#JavaPostTest
POST请求，IP就是学校分配的地址，冒号后面为服务端指定的端口号  
注意请求的格式和头信息  
POST http://10.82.82.105:12345/  

POST data:  
{  
   "id" : 54321,  
   "jsonrpc" : "2.0",  
   "method" : "Regist.Rank",   
   "params" : {  
        
   }  
}  

[no cookies]

Request Headers:  
Connection: keep-alive  
Accept-Encoding: gzip  
Content-Type: application/json  
Content-Length: 106  
Host: 10.82.82.105:12345  
User-Agent: Apache-HttpClient/4.5.2 (Java/1.8.0_101)  
3.请求成功应返回JSON数据如下  
{  
:   "jsonrpc":"2.0",  
:   "result":  
:   {
:   :   "data":  
:   :   [  
:   :   :   {  
:   :   :   :   "phone":18888888888,  
:   :   :   :   "name":"newDriver"  
:   :   :   }  
:   :   ]  
:   },  
:   "id":54321  
}  