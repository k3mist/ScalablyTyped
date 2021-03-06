package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
  * This is the base class of any Procedural texture and contains most of the shareable code.
  * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures
  */
@JSGlobal("BABYLON.ProceduralTexture")
@js.native
class ProceduralTexture protected () extends Texture {
  /**
    * Instantiates a new procedural texture.
    * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
    * This is the base class of any Procedural texture and contains most of the shareable code.
    * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures
    * @param name  Define the name of the texture
    * @param size Define the size of the texture to create
    * @param fragment Define the fragment shader to use to generate the texture or null if it is defined later
    * @param scene Define the scene the texture belongs to
    * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
    * @param generateMipMaps Define if the texture should creates mip maps or not
    * @param isCube Define if the texture is a cube texture or not (this will render each faces of the cube)
    */
  def this(name: java.lang.String, size: js.Any, fragment: js.Any, scene: Nullable[Scene]) = this()
  def this(name: java.lang.String, size: js.Any, fragment: js.Any, scene: Nullable[Scene], fallbackTexture: Nullable[Texture]) = this()
  def this(name: java.lang.String, size: js.Any, fragment: js.Any, scene: Nullable[Scene], fallbackTexture: Nullable[Texture], generateMipMaps: scala.Boolean) = this()
  def this(name: java.lang.String, size: js.Any, fragment: js.Any, scene: Nullable[Scene], fallbackTexture: Nullable[Texture], generateMipMaps: scala.Boolean, isCube: scala.Boolean) = this()
  var _cachedDefines: js.Any = js.native
  var _checkUniform: js.Any = js.native
  var _colors3: js.Any = js.native
  var _colors4: js.Any = js.native
  var _contentData: js.Any = js.native
  var _contentUpdateId: js.Any = js.native
  var _createIndexBuffer: js.Any = js.native
  var _currentRefreshId: js.Any = js.native
  /** @hidden **/
  var _effect: Effect = js.native
  var _engine: js.Any = js.native
  var _fallbackTexture: js.Any = js.native
  var _fallbackTextureUsed: js.Any = js.native
  var _floats: js.Any = js.native
  var _floatsArrays: js.Any = js.native
  var _fragment: js.Any = js.native
  /** @hidden */
  var _generateMipMaps: scala.Boolean = js.native
  var _indexBuffer: js.Any = js.native
  var _ints: js.Any = js.native
  var _matrices: js.Any = js.native
  var _refreshRate: js.Any = js.native
  var _samplers: js.Any = js.native
  var _size: js.Any = js.native
  /** @hidden */
  var _textures: org.scalablytyped.runtime.StringDictionary[Texture] = js.native
  var _uniforms: js.Any = js.native
  var _vectors2: js.Any = js.native
  var _vectors3: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  /**
    * Define if the texture must be cleared before rendering (default is true)
    */
  var autoClear: scala.Boolean = js.native
  /**
    * Define if the texture is enabled or not (disabled texture will not render)
    */
  var isEnabled: scala.Boolean = js.native
  /**
    * Event raised when the texture is generated
    */
  var onGeneratedObservable: Observable[ProceduralTexture] = js.native
  /**
    * Define the refresh rate of the texture or the rendering frequency.
    * Use 0 to render just once, 1 to render on every frame, 2 to render every two frames and so on...
    */
  var refreshRate: scala.Double = js.native
  /* protected */ def _getDefines(): java.lang.String = js.native
  /** @hidden */
  def _shouldRender(): scala.Boolean = js.native
  /**
    * Gets texture content (Use this function wisely as reading from a texture can be slow)
    * @returns an ArrayBufferView (Uint8Array or Float32Array)
    */
  def getContent(): Nullable[stdLib.ArrayBufferView] = js.native
  /**
    * Get the size the texture is rendering at.
    * @returns the size (texture is always squared)
    */
  def getRenderSize(): scala.Double = js.native
  /**
    * Callback called when the texture is generated
    */
  def onGenerated(): scala.Unit = js.native
  /**
    * Render the texture to its associated render target.
    * @param useCameraPostProcess Define if camera post process should be applied to the texture
    */
  def render(): scala.Unit = js.native
  def render(useCameraPostProcess: scala.Boolean): scala.Unit = js.native
  /**
    * Resets the texture in order to recreate its associated resources.
    * This can be called in case of context loss
    */
  def reset(): scala.Unit = js.native
  /**
    * Resets the refresh counter of the texture and start bak from scratch.
    * Could be usefull to regenerate the texture if it is setup to render only once.
    */
  def resetRefreshCounter(): scala.Unit = js.native
  /**
    * Resize the texture to new value.
    * @param size Define the new size the texture should have
    * @param generateMipMaps Define whether the new texture should create mip maps
    */
  def resize(size: scala.Double, generateMipMaps: scala.Boolean): scala.Unit = js.native
  /**
    * Set a vec3 in the shader from a Color3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setColor3(name: java.lang.String, value: Color3): ProceduralTexture = js.native
  /**
    * Set a vec4 in the shader from a Color4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setColor4(name: java.lang.String, value: Color4): ProceduralTexture = js.native
  /**
    * Set a float in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setFloat(name: java.lang.String, value: scala.Double): ProceduralTexture = js.native
  /**
    * Set an array of floats in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setFloats(name: java.lang.String, value: js.Array[scala.Double]): ProceduralTexture = js.native
  /**
    * Set the fragment shader to use in order to render the texture.
    * @param fragment This can be set to a path (into the shader store) or to a json object containing a fragmentElement property.
    */
  def setFragment(fragment: js.Any): scala.Unit = js.native
  /**
    * Set a int in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setInt(name: java.lang.String, value: scala.Double): ProceduralTexture = js.native
  /**
    * Set a mat4 in the shader from a MAtrix.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setMatrix(name: java.lang.String, value: Matrix): ProceduralTexture = js.native
  /**
    * Set a texture in the shader program used to render.
    * @param name Define the name of the uniform samplers as defined in the shader
    * @param texture Define the texture to bind to this sampler
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setTexture(name: java.lang.String, texture: Texture): ProceduralTexture = js.native
  /**
    * Set a vec2 in the shader from a Vector2.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setVector2(name: java.lang.String, value: Vector2): ProceduralTexture = js.native
  /**
    * Set a vec3 in the shader from a Vector3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the texture itself allowing "fluent" like uniform updates
    */
  def setVector3(name: java.lang.String, value: Vector3): ProceduralTexture = js.native
}

