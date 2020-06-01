# Layout
sopt 1st semina _ layout


[기본과제 1]
**layout_constraintDimensionRatio="width:height"
ConstraintLayout 에서 위젯의 width, height 를 비율로 지정 할 수 있는 기능
1.비율로 지정하고 싶은 width/height 에 0dp (MATCH_CONSTRAINT) 로 지정 
2.layout_constraintDimensionRatio="width:height" 속성 작성

참고: https://m.blog.naver.com/PostView.nhn?blogId=pistolcaffe&logNo=221010983726&proxyReferer=https:%2F%2Fwww.google.com%2F


**0dp == match_constraint
크기를 0dp로 설정하면 constraint에 꽉차게 크기가 맞춰짐
양쪽 constraint 를 모두  선언해주어야함

참고: https://beomseok95.tistory.com/305



[기본과제 2]
**Kotlin findViewById는 그만!
Kotlin Extention 사용으로 view접근하자~
참고:https://www.androidhuman.com/lecture/kotlin/2016/07/25/kotlin_android_extensions/

**인텐트 주고받기
1.startActivityForResult
2.setResult (putExtra하고 intent를 인자로 넣어준다)
3.finish
4.onActivityResult
참고:부스트코스 안드로이드 프로그래밍강의

**코틀린에서 getText()함수는 없다!
et_email.text.toString 을 해야 putExtra,getStringExtra에서 제대로 받을 수있다. 아니면 null값 return됨 

[성장과제2]
**SharedPreferences

-DB로 관리하기는 애매한 간단한 설정 값이나 문자열 같은 앱 데이터를 SharedPreferences를 사용하여 저장
-데이터를 파일로 저장하므로 파일이 앱 폴더 내에 저장되므로 앱을 삭제면 데이터도 삭제됨
 :data/data/(package_name)/shared_prefs/SharedPreference에 저장됨
 
-데이터 저장(set)
 :데이터를 저장 할 때는 SharedPreferences.Editor를 이용, 데이터 타입에 따라 put
 :마지막에 commit을 해야 적용됨!!
 :코드 
  val pref = this.getPreferences("prefs",0) //0은 (Context.MODE_PRIVATE)와 같음
  val editor = pref.edit() 
  editor.putString("email", email.toString()) //putBoolean, putInt, putLong 등 데이터타입에 따라 사용
  editor.putString("pwd", pwd.toString())
  editor.commit()
    
-데이터 로드(get)
  :저장할 때 사용했던 key 값을 이용
  :로드시 해당 key에 해당되는 데이터가 없다면 default로 설정한 값이 호출
  :코드
    val prefs = getSharedPreferences("prefs",0);
    et_email.setText(prefs.getString(key, "")); //""는 DEFAULT VALUE STRING

참고: https://re-build.tistory.com/37 /*SharedPreferences Class 코드*/
참고: https://blog.yena.io/studynote/2017/12/18/Android-Kotlin-SharedPreferences.html /*SharedPreferences Kotlin 코드*/
