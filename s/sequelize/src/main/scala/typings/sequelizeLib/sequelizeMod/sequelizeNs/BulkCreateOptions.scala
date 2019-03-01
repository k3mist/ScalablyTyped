package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.bulkCreate method
  */
trait BulkCreateOptions
  extends FieldsOptions
     with LoggingOptions
     with SearchPathOptions
     with ReturningOptions {
  /**
    * Run before / after bulk create hooks?
    */
  var hooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ignore duplicate values for primary keys? (not supported by postgres)
    *
    * Defaults to false
    */
  var ignoreDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Run before / after create hooks for each individual Instance? BulkCreate hooks will still be run if
    * options.hooks is true.
    */
  var individualHooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Fields to update if row key already exists (on duplicate key update)? (only supported by mysql &
    * mariadb). By default, all fields are updated.
    */
  var updateOnDuplicate: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BulkCreateOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Array[java.lang.String] = null,
    hooks: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    individualHooks: js.UndefOr[scala.Boolean] = js.undefined,
    logging: scala.Boolean | js.Function = null,
    returning: js.UndefOr[scala.Boolean] = js.undefined,
    searchPath: java.lang.String = null,
    transaction: Transaction = null,
    updateOnDuplicate: js.Array[java.lang.String] = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined
  ): BulkCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (!js.isUndefined(ignoreDuplicates)) __obj.updateDynamic("ignoreDuplicates")(ignoreDuplicates)
    if (!js.isUndefined(individualHooks)) __obj.updateDynamic("individualHooks")(individualHooks)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning)
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (updateOnDuplicate != null) __obj.updateDynamic("updateOnDuplicate")(updateOnDuplicate)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[BulkCreateOptions]
  }
}

