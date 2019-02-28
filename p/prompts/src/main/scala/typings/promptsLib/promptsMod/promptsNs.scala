package typings
package promptsLib.promptsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prompts", "prompts")
@js.native
object promptsNs extends js.Object {
  trait Choice extends js.Object {
    var disable: js.UndefOr[scala.Boolean] = js.undefined
    var title: java.lang.String
    var value: java.lang.String
  }
  
  trait Options extends js.Object {
    var onCancel: js.UndefOr[
        js.Function2[/* prompt */ PromptObject[java.lang.String], /* answers */ js.Any, scala.Unit]
      ] = js.undefined
    var onSubmit: js.UndefOr[
        js.Function3[
          /* prompt */ PromptObject[java.lang.String], 
          /* answer */ js.Any, 
          /* answers */ js.Array[_], 
          scala.Unit
        ]
      ] = js.undefined
  }
  
  trait PromptObject[T /* <: java.lang.String */] extends js.Object {
    var active: js.UndefOr[java.lang.String] = js.undefined
    var choices: js.UndefOr[js.Array[Choice]] = js.undefined
    var float: js.UndefOr[scala.Boolean] = js.undefined
    var format: js.UndefOr[PrevCaller[T, scala.Unit]] = js.undefined
    var hint: js.UndefOr[java.lang.String] = js.undefined
    var inactive: js.UndefOr[java.lang.String] = js.undefined
    var increment: js.UndefOr[scala.Double] = js.undefined
    var initial: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
    var limit: js.UndefOr[scala.Double] = js.undefined
    var max: js.UndefOr[scala.Double] = js.undefined
    var message: js.UndefOr[ValueOrFunc[java.lang.String]] = js.undefined
    var min: js.UndefOr[scala.Double] = js.undefined
    var name: ValueOrFunc[T]
    var onState: js.UndefOr[PrevCaller[T, scala.Unit]] = js.undefined
    var round: js.UndefOr[scala.Double] = js.undefined
    var seperator: js.UndefOr[java.lang.String] = js.undefined
    var style: js.UndefOr[java.lang.String] = js.undefined
    var suggest: js.UndefOr[
        js.Function3[
          /* prev */ js.Any, 
          /* values */ js.Any, 
          /* prompt */ PromptObject[java.lang.String], 
          scala.Unit
        ]
      ] = js.undefined
    var `type`: ValueOrFunc[PromptType] | Falsy
    var validate: js.UndefOr[PrevCaller[T, scala.Unit]] = js.undefined
  }
  
  trait PromptType extends js.Object
  
  def autocomplete(args: PromptObject[java.lang.String]): js.Any = js.native
  def confirm(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def invisible(args: PromptObject[java.lang.String]): js.Any = js.native
  def list(args: PromptObject[java.lang.String]): js.Any = js.native
  def multiselect(args: PromptObject[java.lang.String]): js.Any = js.native
  def number(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def password(args: PromptObject[java.lang.String]): js.Any = js.native
  def select(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def text(args: PromptObject[java.lang.String]): scala.Unit = js.native
  def toggle(args: PromptObject[java.lang.String]): scala.Unit = js.native
  type Answers[T /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ id in T ]: any}
    */ promptsLib.promptsLibStrings.Answers with js.Any
  type Falsy = js.UndefOr[promptsLib.promptsLibNumbers.`false` | scala.Null]
  type PrevCaller[T /* <: java.lang.String */, R] = js.Function3[
    /* prev */ js.Any, 
    /* values */ Answers[T], 
    /* prompt */ PromptObject[java.lang.String], 
    R
  ]
  type ValueOrFunc[T /* <: java.lang.String */] = T | (PrevCaller[T, T])
}

