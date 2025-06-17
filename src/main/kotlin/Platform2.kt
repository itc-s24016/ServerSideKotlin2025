package jp.ac.it_college.std.s24016.kotlin.platforms.platforms
//sealed(使用例)
//sealed を活用してツリー状に機能を継承させている

sealed interface Platform2

sealed interface Pc : Platform2
sealed interface Smartphone : Platform2

sealed interface Windows : Pc
sealed interface Linux : Pc
sealed interface MacOS : Pc

sealed interface Android : Smartphone
sealed interface IOS : Smartphone

sealed interface Google : Android
sealed interface Samsung : Android
sealed interface Sony : Android