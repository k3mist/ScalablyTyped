package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name[K, V]
  extends mobxLib.libTypesObservablemapMod.IMapDidChange[K, V] {
  var name: K
  var newValue: V
  var `object`: mobxLib.libTypesObservablemapMod.ObservableMap[K, V]
  var oldValue: V
  var `type`: mobxLib.mobxLibStrings.update
}

object Anon_Name {
  @scala.inline
  def apply[K, V](
    name: K,
    newValue: V,
    `object`: mobxLib.libTypesObservablemapMod.ObservableMap[K, V],
    oldValue: V,
    `type`: mobxLib.mobxLibStrings.update
  ): Anon_Name[K, V] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], `object` = `object`, oldValue = oldValue.asInstanceOf[js.Any], `type` = `type`)
  
    __obj.asInstanceOf[Anon_Name[K, V]]
  }
}

