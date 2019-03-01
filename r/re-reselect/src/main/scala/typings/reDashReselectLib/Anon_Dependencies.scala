package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dependencies[C, D] extends js.Object {
  var dependencies: D
  var resultFunc: C
  def recomputations(): scala.Double
  def resetRecomputations(): scala.Double
}

object Anon_Dependencies {
  @scala.inline
  def apply[C, D](
    dependencies: D,
    recomputations: js.Function0[scala.Double],
    resetRecomputations: js.Function0[scala.Double],
    resultFunc: C
  ): Anon_Dependencies[C, D] = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], recomputations = recomputations, resetRecomputations = resetRecomputations, resultFunc = resultFunc.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Dependencies[C, D]]
  }
}

