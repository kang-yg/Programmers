<Level_01_Q02 : 모의고사 - 완전탐색>  
완전탐색 : 컴퓨터의 연산 속도를 이용하여 가능한 경우의 수를 일일이 확인하는 방법이다.  
문제의 패턴(수포자의 패턴)의 길이로 나누어 나머지의 값에 따라 반환값이 결정된다.  
  
<Level_01_Q12 : 체육복 - 탐욕법 알고리즘>  
* 탐욕법 : 문제를 해결히는 과정에서 그 순간순간마다 최선이라고 생각되는 결정을 하는 방식으로 진행하여 최종 해답에 도달하는 문제 해결 방식이다. 하지만 최선의 선택들이 최종적으로는 최선의 해결책이 되지 않는다.  
계산 속도에 있다 탐욕법을 사용한다. 이것은 Dynamic Programming과 서로 보완하는 개념이다.  
* Dynamic Programming : 문제를 여러 개의 하위 문제로 나누어 해결하고, 하위 문제들의 해결 방법들을 결합하여 최종 문제를 해결하는 문제 해결 방식이다.  
  
<Level_01_Q15 : 문자열 내 마음대로 정렬하기>  
* Kotlin에서는 String에서 인덱스를 이용해 Char처럼 이용이 가능하다.  
val str : String = "ABCD"  
println(str[0]) //결과 : "A"  
* String의 대소비교가 가능하다  
val str01 : String = "abce"  
val str02 : String = "abcd"  
if (str01 > str02) println(str01) else println(str02) //결과 : "abce"  
  
<Level_01_Q19 : 이상한 문자열 만들기> - ★미해결★  
* val str : String에서 " "(공백)이 포함되어 있는지 확인하는 방법 : (Character.isWhitespace(str[i])  
  
<Level_01_Q21 : 정수 제곱근 판별>  
※ Math.pow를 사용해서 제곱을 구하려 했더니 3번, 6번 ,13번 테스트케이스에서 실패를 해서 Math.pow를 사용하지 않고 직접 제곱했더니 통과가 되었다.  
  
<Level_01_Q24 : 최대공약수와 최소공배수>  
* 최대공약수(GCD) : java.math.BigInteger의 gcd()메소드를 이용  
val gcdNum : Int = n.toBigInteger().gcd(m.toBigInteger()).toInt()  
* 최소공배수(LCM) : val lcdNum : Int = (n * m) / gcdNum  
