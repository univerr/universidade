# universidade,import using git
user.email=heydelailah@gmail.com                                                                              
core.repositoryformatversion=0                                                                                
core.filemode=true                                                                                            
core.logallrefupdates=true                                                                                    
remote.origin.url=https://github.com/heydelailah/universidade.git                                             
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*                                                       
branch.master.remote=origin                                                                                   
branch.master.merge=refs/heads/master                                                                         
user.name=                                                                                                    
user.email=                                                                                                   
root@2e398d216585:/projects/universidade#     
git config --global user.email "you@example.com"                                                            
  git config --global user.name "Your Name"   
  
  
  Omit --global to set the identity only in this repository.fatal: unable to auto-detect email address (got 'root@2e398d216585.(none)')
  
  
  
  
  
  local
  root@2e398d216585:/projects/universidade# git config --local -l                                               
core.repositoryformatversion=0                                                                                
core.filemode=true                                                                                            
core.logallrefupdates=true                                                                                    
remote.origin.url=https://github.com/heydelailah/universidade.git                                             
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*                                                       
branch.master.remote=origin                                                                                   
branch.master.merge=refs/heads/master                                                                         
user.name=heydelailah                                                                                         
user.email=heydelailah@gmail.com                                                                              
root@2e398d216585:/projects/universidade#  






global
user.email=heydelailah@gmail.com                                                                              
core.repositoryformatversion=0                                                                                
core.filemode=true                                                                                            
core.logallrefupdates=true                                                                                    
remote.origin.url=https://github.com/heydelailah/universidade.git                                             
remote.origin.fetch=+refs/heads/*:refs/remotes/origin/*                                                       
branch.master.remote=origin                                                                                   
branch.master.merge=refs/heads/master                                                                         
user.name=heydelailah                                                                                         
user.email=heydelailah@gmail.com                                                                              
root@2e398d216585:/projects/universidade#    



git config remote.origin.url https://you:password@github.com/you/example.git
git config --unset credential.helper
git config --global credential.helper store