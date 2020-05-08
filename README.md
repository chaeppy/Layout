# Layout
sopt 1st semina _ layout


[기본과제 1]
*layout_constraintDimensionRatio="width:height"
ConstraintLayout 에서 위젯의 width, height 를 비율로 지정 할 수 있는 기능
1.비율로 지정하고 싶은 width/height 에 0dp (MATCH_CONSTRAINT) 로 지정 
2.layout_constraintDimensionRatio="width:height" 속성 작성

참고: https://m.blog.naver.com/PostView.nhn?blogId=pistolcaffe&logNo=221010983726&proxyReferer=https:%2F%2Fwww.google.com%2F


*0dp == match_constraint
크기를 0dp로 설정하면 constraint에 꽉차게 크기가 맞춰짐
양쪽 constraint 를 모두  선언해주어야함

참고: https://beomseok95.tistory.com/305



[기본과제 2]
*Kotlin findViewById는 그만! 
Kotlin Extention 사용으로 view접근하자~
참고:https://www.androidhuman.com/lecture/kotlin/2016/07/25/kotlin_android_extensions/

*인텐트 주고받기
1.startActivityForResult
2.setResult (putExtra하고 intent를 인자로 넣어준다)
3.finish
4.onActivityResult
참고:부스트코스 안드로이드 프로그래밍강의

*코틀린에서 getText()함수는 없다!
et_email.text.toString 을 해야 putExtra,getStringExtra에서 제대로 받을 수있다. 아니면 null값 return됨 
