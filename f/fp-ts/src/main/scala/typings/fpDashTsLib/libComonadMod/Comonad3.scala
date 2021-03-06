package typings
package fpDashTsLib.libComonadMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comonad3[F /* <: fpDashTsLib.libHKTMod.URIS3 */]
  extends fpDashTsLib.libExtendMod.Extend3[F] {
  def extract[U, L, A](ca: fpDashTsLib.libHKTMod.Type3[F, U, L, A]): A
}

object Comonad3 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */](
    URI: F,
    extend: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[/* fa */ fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any],
    extract: fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any] => js.Any,
    map: (fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, js.Any, js.Any, js.Any]
  ): Comonad3[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], extend = js.Any.fromFunction2(extend), extract = js.Any.fromFunction1(extract), map = js.Any.fromFunction2(map))
  
    __obj.asInstanceOf[Comonad3[F]]
  }
}

