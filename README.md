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

### Class
- 정의: a set of objects which shares common characteristics/ behavior and common properties/ attributes
- 특징:
	1. 클래스는 메모리를 차지하지 않는다. 
	2. Class is a group of variables of different data types and a group of methods.
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
## Object and Instance

## super and super()

## Overloading and Overiding

## Abstract and Interface

## Framework vs Library


## reference
- https://www.geeksforgeeks.org/packages-in-java/
- https://velog.io/@hyun_ha/JAVA-%ED%8C%A8%ED%82%A4%EC%A7%80Package
- https://hyoje420.tistory.com/14
- https://wikidocs.net/
- https://www.geeksforgeeks.org/classes-objects-java/#:~:text=A%20class%20in%20Java%20is,named%20Ravi%20is%20an%20object.


# Week 2
- Stateful, Stateless, 세션, 쿠키
- host, domain, IP, HTTP 상태코드
- Spring의 3가지 의존성 주입 방식, 어노테이션
- 정적 팩토리 메서드 패턴
- 빌더패턴 + 정적팩토리 메서드 패턴의 장점
# Week 3
- Spring Boot의 구동 원리 - Dispatcher Servlet 동작 방식 위주로
