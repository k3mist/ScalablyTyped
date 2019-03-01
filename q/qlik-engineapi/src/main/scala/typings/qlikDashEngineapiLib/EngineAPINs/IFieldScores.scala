package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldScores...
  */
trait IFieldScores extends js.Object {
  /**
    * Cardinality of a column/field divided by the number of rows in the table.
    * If the cardinal ratio is 1, it means that the column is a candidate/primary key.
    */
  var qCardinalRatio: scala.Double
  /**
    * Field name.
    * One of the field names defined in qFieldPairName.
    */
  var qFieldName: java.lang.String
  /**
    * Number of matches between the two fields defined in qFieldPairName divided by the number
    * of values in the field qFieldName.
    * If 0, it means that there are no common values between the two fields defined in qFieldPairName.
    */
  var qRowScore: scala.Double
  /**
    * Number of distinct matches between the two fields defined in qFieldPairName divided
    * by the number of distinct values in the field qFieldName.
    * If 0, it means that there are no common values between the two fields defined in qFieldPairName.
    */
  var qSymbolScore: scala.Double
}

object IFieldScores {
  @scala.inline
  def apply(
    qCardinalRatio: scala.Double,
    qFieldName: java.lang.String,
    qRowScore: scala.Double,
    qSymbolScore: scala.Double
  ): IFieldScores = {
    val __obj = js.Dynamic.literal(qCardinalRatio = qCardinalRatio, qFieldName = qFieldName, qRowScore = qRowScore, qSymbolScore = qSymbolScore)
  
    __obj.asInstanceOf[IFieldScores]
  }
}

