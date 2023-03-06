package domain

import model.LottoNumber

interface LottoGenerator {
    fun generate(): List<LottoNumber>
}