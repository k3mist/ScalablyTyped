package typings
package quillLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object quillMod {
  type DeltaOperation = quillLib.Anon_Delete with OptionalAttributes
  type EditorChangeHandler = (js.Function4[
    quillLib.quillLibStrings.`text-change`, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any, 
    /* source */ Sources, 
    js.Any
  ]) | (js.Function4[
    quillLib.quillLibStrings.`selection-change`, 
    /* range */ RangeStatic, 
    /* oldRange */ RangeStatic, 
    /* source */ Sources, 
    js.Any
  ])
  type SelectionChangeHandler = js.Function3[/* range */ RangeStatic, /* oldRange */ RangeStatic, /* source */ Sources, js.Any]
  type TextChangeHandler = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any, 
    /* source */ Sources, 
    js.Any
  ]
}
