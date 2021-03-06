package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpsertGraphAndFetch[QM /* <: Model */] extends js.Object {
  def apply(): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(modelOrObject: DeepPartialGraph[QM]): QueryBuilder[QM, QM, QM] = js.native
  def apply(modelOrObject: DeepPartialGraph[QM], options: UpsertGraphOptions): QueryBuilder[QM, QM, QM] = js.native
  def apply(modelsOrObjects: js.Array[DeepPartialGraph[QM]]): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
  def apply(modelsOrObjects: js.Array[DeepPartialGraph[QM]], options: UpsertGraphOptions): QueryBuilder[QM, js.Array[QM], js.Array[QM]] = js.native
}

