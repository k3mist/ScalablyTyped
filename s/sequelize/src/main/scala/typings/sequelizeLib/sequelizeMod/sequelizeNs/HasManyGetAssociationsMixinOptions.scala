package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for the getAssociations mixin of the hasMany association.
  * @see HasManyGetAssociationsMixin
  */
trait HasManyGetAssociationsMixinOptions extends js.Object {
  /**
    * Load further nested related models
    */
  var include: js.UndefOr[IncludeOptions] = js.undefined
  /**
    * Apply a scope on the related model, or remove its default scope by passing false.
    */
  var scope: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
    * An optional where clause to limit the associated models.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object HasManyGetAssociationsMixinOptions {
  @scala.inline
  def apply(
    include: IncludeOptions = null,
    scope: java.lang.String | scala.Boolean = null,
    where: AnyWhereOptions = null
  ): HasManyGetAssociationsMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (include != null) __obj.updateDynamic("include")(include)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[HasManyGetAssociationsMixinOptions]
  }
}

