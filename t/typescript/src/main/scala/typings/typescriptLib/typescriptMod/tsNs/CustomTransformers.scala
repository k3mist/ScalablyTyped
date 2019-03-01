package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomTransformers extends js.Object {
  /** Custom transformers to evaluate after built-in .js transformations. */
  var after: js.UndefOr[js.Array[TransformerFactory[SourceFile]]] = js.undefined
  /** Custom transformers to evaluate after built-in .d.ts transformations. */
  var afterDeclarations: js.UndefOr[js.Array[TransformerFactory[Bundle | SourceFile]]] = js.undefined
  /** Custom transformers to evaluate before built-in .js transformations. */
  var before: js.UndefOr[js.Array[TransformerFactory[SourceFile]]] = js.undefined
}

object CustomTransformers {
  @scala.inline
  def apply(
    after: js.Array[TransformerFactory[SourceFile]] = null,
    afterDeclarations: js.Array[TransformerFactory[Bundle | SourceFile]] = null,
    before: js.Array[TransformerFactory[SourceFile]] = null
  ): CustomTransformers = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterDeclarations != null) __obj.updateDynamic("afterDeclarations")(afterDeclarations)
    if (before != null) __obj.updateDynamic("before")(before)
    __obj.asInstanceOf[CustomTransformers]
  }
}

