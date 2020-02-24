class Duck
  def initialize
    raise NotImplementedError, "Inherit from this class, do not implement"
  end

  # #display is defined on Object
  def display_duck
    raise NotImplementedError, "Define this in the subclass"
  end
end
