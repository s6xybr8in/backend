# Week1

- package, class, instance, object, access modifer(접근 지정자)
- super, super()
- Overloading, Overiding
- Abstract Class , Interface
- Frame work vs Library

## Package, Class and Access Modifier
### Package 
- 정의: Class의 그룹(Group)으로 Class를 용도별이나, 기능별로 그룹화 한 것
- 기능:
	1. Preventing naming conflict:  Class 이름 중복을 막아준다.
	2. Making searching/locating and usage of classes : 클래스를 찾아 사용하기 편리하다.
	3. Providing controlled access: default 나 protect와 같은 접근 지정자(Access Modifier)를 통해 package내에서만 접근가능
- 특징:
	1. 모든 Class는 Package안에 속해있다.
	2. 만약 패키지를 지정하지 않은 클래스라면 unnamed package안에 속해진다. 
	3. 모든 Class/Interface는 패키지 안에 포함된다. 여러 개의 파일은 같은 패키지 이름을 지정할 수 있다.
	4. 만약 패키지가 지정되었다면 그 파일은 해당 패키지에subdirectory이다 즉, package_name.file이다
	5. 다른 패키지라도 public class 라면 접근할 수 있다.
using package:
```java
package Spring;

public class Name{
	int a;
	...
}
```
using import:
```java
import Spring;

main(){
	Spring.Name.a = 10;
}
```

### Class
- 정의: a set of objects which shares common characteristics(특징)/ behavior(행동) and common properties/ attributes(속성)
- 특징:
	1. Class는 메모리를 차지하지 않는다. 
	2. Class는 변수(Variable)와 메소드(Method)의 그룹(Group)이다.
- include:
	- Data member
	- Method
	- Constructor
	- Nested Class
	- Interface
using class:
```java
public class Dog{
	String name;
	public Dog(){ // Consturctor 
	
	}
	void bark(){ // method
		System.out.println("멍멍!");
	}
}
```
### 접근 제어자(Access Modifer)
- 정의: help to restrict the scope of a class, constructor, variable, method, or data member
- 종류:
	- private: 자기 클래스 내에서 접근
	- default – No keyword required: 같은 패키지내에서 접근
	- protected: 같은 패키지나 다른 패키지의 하위클래스 접근
	- **public**: 모든 곳에서 접근 가능
## Object and Instance

## super and super()

## Overloading and Overiding
### Overloading
- 정의: 자바의 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메소드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메소드를 정의할 수 있다.
- **메소드의 이름이 같고, 매개변수의 개수나 타입이 달라야 한다.**
- **접근 제어자도 자유롭게 지정**

### Overiding
- 정의: **부모 클래스로부터 상속받은 메소드를 자식 클래스에서 재정의**

|                 |                                                                    |                          |
| ----------------|------------------------------------------------------------------- | ------------------------ |
| **구분**        | **Overriding**                                                     | **Overloading**          |
| **접근 제어자** | 부모 클래스의 메소드의 접근 제어자보다 **더 넓은 범위의 접근 제어자**를 자식 클래스의 메소드에서 설정할 수 있다. | **모든 접근 제어자**를 사용할 수 있다. |
| **리턴형**      | 동일해야 한다.                                                           | 달라도 된다.                  |
| **메소드명**    | 동일해야 한다.                                                           | 동일해야 한다.                 |
| **매개변수**    | 동일해야 한다.                                                           | 달라야만 한다.                 |
| **범위**        | **상속관계**에서 적용된다.                                                   | **같은 클래스** 내에서 적용된다.     |
## Abstract and Interface

## Framework vs Library


## reference
- https://www.geeksforgeeks.org/packages-in-java/
- https://velog.io/@hyun_ha/JAVA-%ED%8C%A8%ED%82%A4%EC%A7%80Package
- https://hyoje420.tistory.com/14
- https://wikidocs.net/232
- https://www.geeksforgeeks.org/classes-objects-java/#:~:text=A%20class%20in%20Java%20is,named%20Ravi%20is%20an%20object.
- https://www.geeksforgeeks.org/access-modifiers-java/


# Week 2
- Stateful, Stateless, 세션, 쿠키
- host, domain, IP, HTTP 상태코드
- Spring의 3가지 의존성 주입 방식, 어노테이션
- 정적 팩토리 메서드 패턴
- 빌더패턴 + 정적팩토리 메서드 패턴의 장점
# Week 3
- Spring Boot의 구동 원리 - Dispatcher Servlet 동작 방식 위주로
