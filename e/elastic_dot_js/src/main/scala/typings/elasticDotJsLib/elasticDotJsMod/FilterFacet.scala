package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "FilterFacet")
@js.native
class FilterFacet protected ()
  extends elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet {
  /*
    A facet that return a count of the hits matching the given filter.
    */
  def this(name: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  /* CompleteClass */
  override def _type(): java.lang.String = js.native
  /*
    Enables caching of the facetFilter
    */
  /* CompleteClass */
  override def cacheFilter(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet = js.native
  /*
    Allows you to reduce the documents used for computing facet results.
    */
  /* CompleteClass */
  override def facetFilter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet = js.native
  /*
    Sets the filter to be used for this facet.
    */
  /* CompleteClass */
  override def filter(oFilter: js.Object): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet = js.native
  /*
    Computes values across the entire index
    */
  /* CompleteClass */
  override def global(trueFalse: scala.Boolean): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet = js.native
  /*
    Sets the mode the facet will use.
    collector
    post
    */
  /* CompleteClass */
  override def mode(m: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet = js.native
  /*
    Sets the path to the nested document if faceting against a
    nested field.
    */
  /* CompleteClass */
  override def nested(path: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet = js.native
  /*
    Computes values across the the specified scope
    */
  /* CompleteClass */
  override def scope(scope: java.lang.String): elasticDotJsLib.elasticDotJsMod.elasticjsNs.FilterFacet = js.native
  /*
    Retrieves the internal facet object. This is typically used by
    internal API functions so use with caution.
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

