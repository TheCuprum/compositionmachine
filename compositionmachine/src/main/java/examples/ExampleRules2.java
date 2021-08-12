package examples;

import machine.RuleSet;

/**
 * @author Damian Arellanes
 * Constant, OR and Rule 122
 */
public class ExampleRules2 implements RuleSet {

  @Override
  public int delta1(int organism) {
    return organism;
  }

  @Override
  public int delta2(int organism, int neighbourRight) {
    return (organism == 1 || neighbourRight == 1) ? 1 : 0;
  }

  @Override
  public int delta3(int neighbourLeft, int organism) {
    return (organism == 1 || neighbourLeft == 1) ? 1 : 0;
  }

  @Override
  public int delta4(int neighbourLeft, int organism, int neighbourRight) {
    
    if(neighbourLeft == 1 && organism == 1 && neighbourRight == 1) return 0;
    if(neighbourLeft == 1 && organism == 1 && neighbourRight == 0) return 1;
    if(neighbourLeft == 1 && organism == 0 && neighbourRight == 1) return 1;
    if(neighbourLeft == 1 && organism == 0 && neighbourRight == 0) return 1;
    if(neighbourLeft == 0 && organism == 1 && neighbourRight == 1) return 1;
    if(neighbourLeft == 0 && organism == 1 && neighbourRight == 0) return 0;
    if(neighbourLeft == 0 && organism == 0 && neighbourRight == 1) return 1;
    if(neighbourLeft == 0 && organism == 0 && neighbourRight == 0) return 0;
    
    return -1;
  }

}
