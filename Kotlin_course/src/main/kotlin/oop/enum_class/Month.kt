package oop.enum_class

enum class Month (tempAvg: Int){
    DECEMBER(-12), JANUARY(-20), FEBRUARY(-22), MARCH(8), APRIL(14),
    MAY(18), JUNE(25), JULY(29), AUGUST(31), SEPTEMBER(26),
    OCTOBER(13), NOVEMBER(2)
}
//в классе-перечислениях можно использовать параметры, например, как в примере выше - в таком случае, нужно после
//каждого значения перечисления в скобках указывать значение параметра