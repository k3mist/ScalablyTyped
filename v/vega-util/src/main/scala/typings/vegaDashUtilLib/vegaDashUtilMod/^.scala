package typings
package vegaDashUtilLib.vegaDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Debug: scala.Double = js.native
  val Info: scala.Double = js.native
  val None: scala.Double = js.native
  val Warn: scala.Double = js.native
  def accessor[R](fn: vegaDashUtilLib.Fn[R]): vegaDashUtilLib.vegaDashUtilMod.AccessorFn[R] = js.native
  def accessor[R](fn: vegaDashUtilLib.Fn[R], fields: js.Array[java.lang.String]): vegaDashUtilLib.vegaDashUtilMod.AccessorFn[R] = js.native
  def accessor[R](fn: vegaDashUtilLib.Fn[R], fields: js.Array[java.lang.String], name: java.lang.String): vegaDashUtilLib.vegaDashUtilMod.AccessorFn[R] = js.native
  def accessorFields(fn: vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_]): js.Array[java.lang.String] = js.native
  def accessorName(fn: vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_]): java.lang.String = js.native
  def array[T](v: T): js.Array[T] = js.native
  @JSName("array")
  def array_TArrayT[T /* <: js.Array[_] */](v: T): T = js.native
  def clampRange(range: js.Array[scala.Double], min: scala.Double, max: scala.Double): js.Array[scala.Double] = js.native
  def compare(fields: java.lang.String): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(fields: java.lang.String, orders: js.Array[vegaDashUtilLib.vegaDashUtilMod.Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(fields: java.lang.String, orders: vegaDashUtilLib.vegaDashUtilMod.Order): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(fields: js.Array[vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_] | java.lang.String]): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(
    fields: js.Array[vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_] | java.lang.String],
    orders: js.Array[vegaDashUtilLib.vegaDashUtilMod.Order]
  ): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(
    fields: js.Array[vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_] | java.lang.String],
    orders: vegaDashUtilLib.vegaDashUtilMod.Order
  ): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(fields: vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(
    fields: vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_],
    orders: js.Array[vegaDashUtilLib.vegaDashUtilMod.Order]
  ): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def compare(
    fields: vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_],
    orders: vegaDashUtilLib.vegaDashUtilMod.Order
  ): js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double] = js.native
  def constant[V](v: V): js.Function0[V] = js.native
  def debounce[F /* <: js.Function */](delay: scala.Double, func: F): F = js.native
  def error(msg: java.lang.String): stdLib.Error = js.native
  def extend[T](target: T, source: stdLib.Partial[T]*): T = js.native
  def extent(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def extent(array: js.Array[scala.Double], accessor: vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_]): js.Array[scala.Double] = js.native
  def extentIndex(array: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def extentIndex(array: js.Array[scala.Double], accessor: vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_]): js.Array[scala.Double] = js.native
  def falsy(): vegaDashUtilLib.vegaDashUtilLibNumbers.`false` = js.native
  def fastmap(): vegaDashUtilLib.vegaDashUtilMod.FastMap = js.native
  def fastmap(`_`: js.Object): vegaDashUtilLib.vegaDashUtilMod.FastMap = js.native
  def field(field: java.lang.String): vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_] = js.native
  def field(field: java.lang.String, name: java.lang.String): vegaDashUtilLib.vegaDashUtilMod.AccessorFn[_] = js.native
  def flush[T /* <: js.Any */](
    range: js.Array[scala.Double],
    value: scala.Double,
    threshold: scala.Double,
    left: T,
    right: T,
    center: T
  ): T = js.native
  def id(`_`: js.Object): js.Symbol = js.native
  def identity[V](v: V): V = js.native
  def inherits(child: stdLib.ObjectConstructor, parent: stdLib.ObjectConstructor): js.Object = js.native
  def inrange(value: scala.Double, range: js.Array[scala.Double], left: scala.Boolean, right: scala.Boolean): scala.Boolean = js.native
  def isArray[T](a: js.Any): /* is std.Array<T> */ scala.Boolean = js.native
  def isArray[T](a: js.Array[T]): /* is std.Array<T> */ scala.Boolean = js.native
  def isBoolean(a: js.Any): /* is boolean */ scala.Boolean = js.native
  def isDate(a: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isFunction(a: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isNumber(a: js.Any): /* is number */ scala.Boolean = js.native
  def isObject(a: js.Any): /* is object */ scala.Boolean = js.native
  def isRegExp(a: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def isString(a: js.Any): /* is string */ scala.Boolean = js.native
  def key(fields: js.Array[java.lang.String]): js.Function1[/* _ */ js.Object, java.lang.String] = js.native
  def key(fields: js.Array[java.lang.String], flat: scala.Boolean): js.Function1[/* _ */ js.Object, java.lang.String] = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def logger(): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  def logger(`_`: scala.Double): vegaDashUtilLib.vegaDashUtilMod.LoggerInterface = js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): js.Array[_] = js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double],
    array1: js.Array[_],
    array2: js.Array[_],
    output: js.Array[_]
  ): scala.Unit = js.native
  @JSName("merge")
  def merge_Unit(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): scala.Unit = js.native
  def one(): vegaDashUtilLib.vegaDashUtilLibNumbers.`1` = js.native
  def pad(str: java.lang.String, len: scala.Double): java.lang.String = js.native
  def pad(str: java.lang.String, len: scala.Double, char: java.lang.String): java.lang.String = js.native
  @JSName("pad")
  def pad_center(
    str: java.lang.String,
    len: scala.Double,
    char: java.lang.String,
    align: vegaDashUtilLib.vegaDashUtilLibStrings.center
  ): java.lang.String = js.native
  @JSName("pad")
  def pad_left(
    str: java.lang.String,
    len: scala.Double,
    char: java.lang.String,
    align: vegaDashUtilLib.vegaDashUtilLibStrings.left
  ): java.lang.String = js.native
  @JSName("pad")
  def pad_right(
    str: java.lang.String,
    len: scala.Double,
    char: java.lang.String,
    align: vegaDashUtilLib.vegaDashUtilLibStrings.right
  ): java.lang.String = js.native
  def panLinear(domain: js.Array[scala.Double], delta: scala.Double): js.Array[scala.Double] = js.native
  def panLog(domain: js.Array[scala.Double], delta: scala.Double): js.Array[scala.Double] = js.native
  def panPow(domain: js.Array[scala.Double], delta: scala.Double, exponent: scala.Double): js.Array[scala.Double] = js.native
  def panSymlog(domain: js.Array[scala.Double], delta: scala.Double, constant: scala.Double): js.Array[scala.Double] = js.native
  def peek(array: js.Array[_]): js.Any = js.native
  def quarter(date: scala.Double): scala.Double = js.native
  def quarter(date: stdLib.Date): scala.Double = js.native
  def repeat(str: java.lang.String, count: scala.Double): java.lang.String = js.native
  def span(array: js.Array[scala.Double]): scala.Double = js.native
  def splitAccessPath(path: java.lang.String): js.Array[java.lang.String] = js.native
  def stringValue(a: js.Any): java.lang.String = js.native
  def toBoolean(a: js.Any): scala.Boolean = js.native
  def toDate(a: js.Any): scala.Double = js.native
  def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, scala.Double]): scala.Double = js.native
  def toNumber(a: js.Any): scala.Double = js.native
  def toSet[T](array: js.Array[T]): org.scalablytyped.runtime.StringDictionary[vegaDashUtilLib.vegaDashUtilLibNumbers.`true`] = js.native
  def toString(a: js.Any): java.lang.String = js.native
  def truncate(a: java.lang.String, length: scala.Double): java.lang.String = js.native
  @JSName("truncate")
  def truncate_center(a: java.lang.String, length: scala.Double, align: vegaDashUtilLib.vegaDashUtilLibStrings.center): java.lang.String = js.native
  @JSName("truncate")
  def truncate_center(
    a: java.lang.String,
    length: scala.Double,
    align: vegaDashUtilLib.vegaDashUtilLibStrings.center,
    ellipsis: java.lang.String
  ): java.lang.String = js.native
  @JSName("truncate")
  def truncate_left(a: java.lang.String, length: scala.Double, align: vegaDashUtilLib.vegaDashUtilLibStrings.left): java.lang.String = js.native
  @JSName("truncate")
  def truncate_left(
    a: java.lang.String,
    length: scala.Double,
    align: vegaDashUtilLib.vegaDashUtilLibStrings.left,
    ellipsis: java.lang.String
  ): java.lang.String = js.native
  @JSName("truncate")
  def truncate_right(a: java.lang.String, length: scala.Double, align: vegaDashUtilLib.vegaDashUtilLibStrings.right): java.lang.String = js.native
  @JSName("truncate")
  def truncate_right(
    a: java.lang.String,
    length: scala.Double,
    align: vegaDashUtilLib.vegaDashUtilLibStrings.right,
    ellipsis: java.lang.String
  ): java.lang.String = js.native
  def truthy(): vegaDashUtilLib.vegaDashUtilLibNumbers.`true` = js.native
  def utcquarter(date: scala.Double): scala.Double = js.native
  def utcquarter(date: stdLib.Date): scala.Double = js.native
  def visitArray(
    array: js.Array[_],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[scala.Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ scala.Double, /* arr */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def visitArray(
    array: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[scala.Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ scala.Double, /* arr */ js.Array[_], scala.Unit]
  ): scala.Unit = js.native
  def zero(): vegaDashUtilLib.vegaDashUtilLibNumbers.`0` = js.native
  def zoomLinear(domain: js.Array[scala.Double], anchor: scala.Double, scale: scala.Double): js.Array[scala.Double] = js.native
  def zoomLinear(domain: js.Array[scala.Double], anchor: scala.Null, scale: scala.Double): js.Array[scala.Double] = js.native
  def zoomLog(domain: js.Array[scala.Double], anchor: scala.Double, scale: scala.Double): js.Array[scala.Double] = js.native
  def zoomLog(domain: js.Array[scala.Double], anchor: scala.Null, scale: scala.Double): js.Array[scala.Double] = js.native
  def zoomPow(domain: js.Array[scala.Double], anchor: scala.Double, scale: scala.Double, exponent: scala.Double): js.Array[scala.Double] = js.native
  def zoomPow(domain: js.Array[scala.Double], anchor: scala.Null, scale: scala.Double, exponent: scala.Double): js.Array[scala.Double] = js.native
  def zoomSymlog(domain: js.Array[scala.Double], anchor: scala.Double, scale: scala.Double, constant: scala.Double): js.Array[scala.Double] = js.native
  def zoomSymlog(domain: js.Array[scala.Double], anchor: scala.Null, scale: scala.Double, constant: scala.Double): js.Array[scala.Double] = js.native
}

