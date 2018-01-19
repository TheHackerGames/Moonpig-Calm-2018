using System;
using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[RequireComponent(typeof(AudioSource))]
public class AudioQueue : MonoBehaviour {

	public AudioClip[] clips;

	public bool LoopQueue;

	public int SecondsToWaitOnStartup = 5;

	public int SecondsInvervalPerClip = 2;

	private int currentTrack = 0;

	private AudioSource audioSource;

	IEnumerator Start () {
		audioSource = GetComponent<AudioSource> ();

		yield return new WaitForSeconds (SecondsToWaitOnStartup);

		do {
			foreach (var clip in clips) {
					
				audioSource.clip = clip;

				audioSource.Play();

				yield return new WaitForSeconds (audioSource.clip.length);

				yield return new WaitForSeconds (SecondsInvervalPerClip);

			}
		} while (LoopQueue);

		yield break;
	}
}
