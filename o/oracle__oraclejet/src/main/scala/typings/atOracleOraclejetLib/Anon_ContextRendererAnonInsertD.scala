package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertD[K, D] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojsunburstMod.ojSunburstNs.RootNodeContext[K, D]): Anon_Insert
}

object Anon_ContextRendererAnonInsertD {
  @scala.inline
  def apply[K, D](
    renderer: js.Function1[atOracleOraclejetLib.ojsunburstMod.ojSunburstNs.RootNodeContext[K, D], Anon_Insert]
  ): Anon_ContextRendererAnonInsertD[K, D] = {
    val __obj = js.Dynamic.literal(renderer = renderer)
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertD[K, D]]
  }
}

