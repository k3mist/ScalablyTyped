package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateRangeAggregation extends Aggregation {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.  Alias for the
    aggregation method.
    */
  def agg(agg: Aggregation): DateRangeAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): DateRangeAggregation
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): DateRangeAggregation
  /*
    Sets the date format expression.
    */
  def format(f: java.lang.String): DateRangeAggregation
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: scala.Boolean): DateRangeAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): DateRangeAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): DateRangeAggregation
  /*
    Adds a range to the list of exsiting range expressions.
    */
  def range(from: java.lang.String, to: java.lang.String, key: java.lang.String): DateRangeAggregation
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: java.lang.String): DateRangeAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): DateRangeAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object DateRangeAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    agg: Aggregation => DateRangeAggregation,
    aggregation: Aggregation => DateRangeAggregation,
    field: java.lang.String => DateRangeAggregation,
    format: java.lang.String => DateRangeAggregation,
    keyed: scala.Boolean => DateRangeAggregation,
    lang: java.lang.String => DateRangeAggregation,
    params: js.Object => DateRangeAggregation,
    range: (java.lang.String, java.lang.String, java.lang.String) => DateRangeAggregation,
    script: java.lang.String => DateRangeAggregation,
    scriptValuesSorted: scala.Boolean => DateRangeAggregation,
    toJSON: () => js.Any
  ): DateRangeAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), agg = js.Any.fromFunction1(agg), aggregation = js.Any.fromFunction1(aggregation), field = js.Any.fromFunction1(field), format = js.Any.fromFunction1(format), keyed = js.Any.fromFunction1(keyed), lang = js.Any.fromFunction1(lang), params = js.Any.fromFunction1(params), range = js.Any.fromFunction3(range), script = js.Any.fromFunction1(script), scriptValuesSorted = js.Any.fromFunction1(scriptValuesSorted), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[DateRangeAggregation]
  }
}

