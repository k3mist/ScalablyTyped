package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a model within a model.
  */
trait IRefModelInModel extends js.Object {
  var childId: java.lang.String
  var childModel: IModel
  var parentModel: IModel
}

object IRefModelInModel {
  @scala.inline
  def apply(childId: java.lang.String, childModel: IModel, parentModel: IModel): IRefModelInModel = {
    val __obj = js.Dynamic.literal(childId = childId, childModel = childModel, parentModel = parentModel)
  
    __obj.asInstanceOf[IRefModelInModel]
  }
}

