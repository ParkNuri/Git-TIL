# markdown 기초 (Feat. Typora)

## 1. 제목(Heading)

제목은 `#` 으로 표시된다. 제목 레벨은 6단계까지 있다.

# h1

## h2

### h3

### h4

#### h5

##### h6



# 2. 목록

1. 순서가 있는 목록

2.  순서가 있는 목록

   1. enter + tab 을 통해 레벨 다운

   * 순서가 있는 목록`*`





# 3. 링크

[마크다운설명서](https://guides.github.com/features/mastering-markdown/)



# 4. 이미지

![download](images/download.jpg)

* typora에서 이미지를 편하게 활용하기 위해서는 추가 설정이 필요!

  :이미지 저장시 [환경설정] - [이미지] - [Copy image to custom folder] 선택 후 

  * 아래의 옵션을 모두 체크
    * 로컬 이미지에 해당 규칙
    * 온라인 이미지에 해당 규칙
    * 가능하다면 상대 경로

  * 폴더 저장경로를 custom으로 설정
    * ./images    (현재 폴더 내의 저장하고 싶은 위치 주소 지정)



## 5. 인용문 (Quote)

> 인용문은 `>`을 활용한다.



# 6. 표

| 순번 | 이름   | 정보 |
| ---- | ------ | ---- |
| 1    | 홍길동 | 남자 |
|      |        |      |
|      |        |      |

[편집]-[표]



# 7. 코드

코드 block(```)을 설정하면, 해당 언어에 대한 syntax highlighting이 된다. 

```python
# 파이썬 주석
print('hi')

```

```sql
-- sql 주석
SELECT * FROM table;
```



# 8. 기타

1. 수평선 (---)
2. *이텔릭체(기울임체)*(**)
3. **볼드체**(****)
4. ~~취소선~~(~~~~)



