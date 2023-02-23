import domain.LottoAdministrator
import domain.LottoMachine
import domain.ShuffledLottoGenerator
import model.LottoResult
import view.InputView
import view.OutputView

fun main() = LottoController(
    InputView(),
    OutputView(),
    LottoMachine(ShuffledLottoGenerator()),
    LottoAdministrator(),
    LottoResult(),
).run()
