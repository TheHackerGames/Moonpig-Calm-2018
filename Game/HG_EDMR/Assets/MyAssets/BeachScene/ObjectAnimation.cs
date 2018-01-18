using System.Collections;
//using System.Collections.Generic;
using UnityEngine;

public class ObjectAnimation : MonoBehaviour {

	public AnimationCurve curve;

	void Start()
	{
		curve = new AnimationCurve(
			new Keyframe(0, 0), 
			new Keyframe(1, 1)
		);
		curve.preWrapMode = WrapMode.PingPong;
		curve.postWrapMode = WrapMode.PingPong;
	}

	void Update()
	{
//		transform.position = new Vector3(transform.position.x, curve.Evaluate(Time.time), transform.position.z);
//		transform.position = new Vector3(curve.Evaluate(Time.time), transform.position.y, transform.position.z);
		transform.position = new Vector3(curve.Evaluate(Time.deltaTime), transform.position.y, transform.position.z);
	}
}
