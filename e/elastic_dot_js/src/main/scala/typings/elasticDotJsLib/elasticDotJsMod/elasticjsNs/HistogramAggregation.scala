package typings
package elasticDotJsLib.elasticDotJsMod.elasticjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistogramAggregation extends Aggregation {
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
  def agg(agg: Aggregation): HistogramAggregation
  /*
    Add a nested aggregation.  This method can be called multiple times
    in order to set multiple nested aggregations what will be executed
    at the same time as the parent aggregation.
    */
  def aggregation(agg: Aggregation): HistogramAggregation
  /*
    Set's the range/bounds for the histogram aggregation.  Useful when you
    want to include buckets that might be outside the bounds of indexed
    documents.
    */
  def extendedBounds(min: scala.Double, max: scala.Double): HistogramAggregation
  /*
    Sets the field to gather terms from.
    */
  def field(field: java.lang.String): HistogramAggregation
  /*
    Sets the format expression for the terms.  Use for number or date
    formatting
    */
  def format(f: java.lang.String): HistogramAggregation
  /*
    Sets the histogram interval.  Buckets are generated based on this interval
    value.
    */
  def interval(i: scala.Double): HistogramAggregation
  /*
    Enable the response to be returned as a keyed object where the key is the
    bucket interval.
    */
  def keyed(trueFalse: scala.Boolean): HistogramAggregation
  /*
    The script language being used.
    */
  def lang(language: java.lang.String): HistogramAggregation
  /*
    Only return terms that match more than a configured number of hits.
    */
  def minDocCount(num: scala.Double): HistogramAggregation
  /*
    Sets order for the aggregated values.
    */
  def order(order: java.lang.String, direction: java.lang.String): HistogramAggregation
  /*
    Sets parameters that will be applied to the script.  Overwrites
    any existing params.
    */
  def params(p: js.Object): HistogramAggregation
  /*
    Allows you generate or modify the terms using a script.
    */
  def script(scriptCode: java.lang.String): HistogramAggregation
  /*
    Set to true to assume script values are sorted.
    */
  def scriptValuesSorted(trueFalse: scala.Boolean): HistogramAggregation
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any
}

object HistogramAggregation {
  @scala.inline
  def apply(
    _type: () => java.lang.String,
    agg: Aggregation => HistogramAggregation,
    aggregation: Aggregation => HistogramAggregation,
    extendedBounds: (scala.Double, scala.Double) => HistogramAggregation,
    field: java.lang.String => HistogramAggregation,
    format: java.lang.String => HistogramAggregation,
    interval: scala.Double => HistogramAggregation,
    keyed: scala.Boolean => HistogramAggregation,
    lang: java.lang.String => HistogramAggregation,
    minDocCount: scala.Double => HistogramAggregation,
    order: (java.lang.String, java.lang.String) => HistogramAggregation,
    params: js.Object => HistogramAggregation,
    script: java.lang.String => HistogramAggregation,
    scriptValuesSorted: scala.Boolean => HistogramAggregation,
    toJSON: () => js.Any
  ): HistogramAggregation = {
    val __obj = js.Dynamic.literal(_type = js.Any.fromFunction0(_type), agg = js.Any.fromFunction1(agg), aggregation = js.Any.fromFunction1(aggregation), extendedBounds = js.Any.fromFunction2(extendedBounds), field = js.Any.fromFunction1(field), format = js.Any.fromFunction1(format), interval = js.Any.fromFunction1(interval), keyed = js.Any.fromFunction1(keyed), lang = js.Any.fromFunction1(lang), minDocCount = js.Any.fromFunction1(minDocCount), order = js.Any.fromFunction2(order), params = js.Any.fromFunction1(params), script = js.Any.fromFunction1(script), scriptValuesSorted = js.Any.fromFunction1(scriptValuesSorted), toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[HistogramAggregation]
  }
}

