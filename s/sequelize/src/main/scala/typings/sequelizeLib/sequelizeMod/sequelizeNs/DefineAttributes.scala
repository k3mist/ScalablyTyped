package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Attributes provided for a column
  *
  * @see Sequelize.define
  */
trait DefineAttributes
  extends /**
  * The description of a database column
  */
/* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String | DataTypeAbstract | DefineAttributeColumnOptions]

object DefineAttributes {
  @scala.inline
  def apply(
    StringDictionary: /**
    * The description of a database column
    */
  /* name */ org.scalablytyped.runtime.StringDictionary[java.lang.String | DataTypeAbstract | DefineAttributeColumnOptions] = null
  ): DefineAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DefineAttributes]
  }
}

