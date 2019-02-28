package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typescriptLib.typescriptMod.tsNs.TypeElement because var conflicts: _declarationBrand, decorators, end, flags, kind, modifiers, name, parent, pos. Inlined _typeElementBrand, questionToken */ @js.native
trait MethodSignature
  extends SignatureDeclarationBase
     with SignatureDeclaration
     with _HasJSDoc {
  var _typeElementBrand: js.Any = js.native
  @JSName("name")
  var name_MethodSignature: PropertyName = js.native
  @JSName("parent")
  var parent_MethodSignature: ObjectTypeDeclaration = js.native
  var questionToken: js.UndefOr[QuestionToken] = js.native
}

