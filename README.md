# Url-shortener

## Tech Stack
Java / Springboot / Mysql / JSP

## Database
![image](https://user-images.githubusercontent.com/58455389/209340403-634f99a3-ca14-4530-b2e3-858119489307.png)

'id' column, 'originurl' column 

## Reference Theory
### Base62
 ASCII 문자열 형식으로 이진 데이터 를 나타내는 이진 -텍스트 인코딩 방식
![image](https://user-images.githubusercontent.com/58455389/209340779-e577c227-908c-4c87-ba46-29666a7b0004.png)
### Why use base62 instead of base64?
Base64에서 62번째(+), 63번째(/) 기호는 url에서 parameter로 사용할 수 없기 때문에 제외.
### Url Shortener Algorithm
![image](https://user-images.githubusercontent.com/58455389/209344225-c17a13f9-b923-4b0c-97b9-178f346cf52f.png)

1. 입력받은 url을 데이터베이스에 저장하여 저장된 index 값을 Base62 encoding을 통해 변환 후 shorten url을 사용자에게 제공

2. 사용자가 shorten url을 사용하게 되면 다시 shorten url을 Base62 decoding하여 데이터베이스의 저장되어 있는 원본 url을 반환
## Result
![image](https://user-images.githubusercontent.com/58455389/209343479-5e4bfd61-c146-4358-9a67-30ec7b42733e.png)

## Current Situation
12/24 기능에 오류가 발생하여 수정중..

12/25 어플리케이션 형식으로 먼저 구현중, 입력-> 키값 할당-> encoding-> 데이터베이스 저장-> shortUrl 반환-> decoding 까지 구현 decoding된 값이 originUrl을 불러오는 부분에 있어서 오류가 발생하여 해결중입니다..! web형식에 있어서 jsp <-> controller 간에 데이터 전송을 할 때 controller에서 받는 값이 Null로 고정되는 오류가 발생하였습니다.
