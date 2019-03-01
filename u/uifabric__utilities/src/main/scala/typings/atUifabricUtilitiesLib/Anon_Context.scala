package typings
package atUifabricUtilitiesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /**
    * Optional transform function for context. Any implementations should take care to return context without
    * mutating it.
    */
  var contextTransform: js.UndefOr[
    js.Function1[
      /* context */ stdLib.Readonly[atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext], 
      atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext
    ]
  ] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    contextTransform: js.Function1[
      /* context */ stdLib.Readonly[atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext], 
      atUifabricUtilitiesLib.libCustomizerMod.ICustomizerContext
    ] = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (contextTransform != null) __obj.updateDynamic("contextTransform")(contextTransform)
    __obj.asInstanceOf[Anon_Context]
  }
}

