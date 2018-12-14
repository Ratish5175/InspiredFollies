package com.redhat.examples.demo;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;

public class CloneRepo {

	public void Clone(String uri, String dir, String branches) throws InvalidRemoteException, TransportException, GitAPIException {
		
		Git.cloneRepository()
		  .setURI(uri)
		  .setDirectory(new File(dir))
		  .setBranchesToClone(Arrays.asList(branches))
		  .setBranch(branches)
		  .call();
		
//		  .setURI("https://github.com/eclipse/jgit.git")
//		  .setDirectory(new File("/path/to/repo"))
//		  .setBranchesToClone(Arrays.asList("refs/heads/specific-branch"))
//		  .setBranch("refs/heads/specific-branch")
//		  .call();
	}
	
}
